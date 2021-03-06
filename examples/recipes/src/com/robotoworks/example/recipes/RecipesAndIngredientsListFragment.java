package com.robotoworks.example.recipes;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import androidx.fragment.app.ListFragment;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;
import androidx.cursoradapter.widget.SimpleCursorAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.robotoworks.example.recipes.content.RecipesDBContract.RecipesAndIngredients;
import com.robotoworks.mechanoid.db.SQuery;

public class RecipesAndIngredientsListFragment extends ListFragment {

    private static final String[] PROJECTION = {
            RecipesAndIngredients._ID,
            RecipesAndIngredients.ROW_TYPE,
            RecipesAndIngredients.TITLE,
            RecipesAndIngredients.DESCRIPTION,
            RecipesAndIngredients.INGREDIENT_QUANTITY,
            RecipesAndIngredients.SORT_KEY
    };
    private RecipesCursorAdapter mAdapter;
    LoaderManager.LoaderCallbacks<Cursor> mLoaderCallbacks =
            new LoaderManager.LoaderCallbacks<Cursor>() {
                @Override
                public Loader<Cursor> onCreateLoader(int id, Bundle args) {
                    return SQuery.newQuery().createSupportLoader(
                            RecipesAndIngredients.CONTENT_URI, PROJECTION);
                }

                @Override
                public void onLoadFinished(Loader<Cursor> loader, Cursor cursor) {
                    mAdapter.swapCursor(cursor);
                }

                @Override
                public void onLoaderReset(Loader<Cursor> loader) {
                    mAdapter.swapCursor(null);
                }
            };

    ;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mAdapter = new RecipesCursorAdapter(getActivity());
        setListAdapter(mAdapter);

        getLoaderManager().initLoader(0, null, mLoaderCallbacks);
    }

    private interface ColumnIndices {
        int ROW_TYPE = 1;
    }

    class RecipesCursorAdapter extends SimpleCursorAdapter {
        private static final int VIEWTYPE_COUNT = 2;
        private static final int VIEWTYPE_RECIPE = 0;
        private static final int VIEWTYPE_INGREDIENT = 1;

        private LayoutInflater mInflater;

        public RecipesCursorAdapter(Context context) {
            super(context,
                    R.layout.item_recipe, null,
                    new String[]{
                            RecipesAndIngredients.TITLE,
                            RecipesAndIngredients.DESCRIPTION,
                            RecipesAndIngredients.INGREDIENT_QUANTITY
                    },
                    new int[]{
                            R.id.title,
                            R.id.description,
                            R.id.quantity
                    }, 0);

            mInflater = (LayoutInflater) LayoutInflater.from(getActivity());
        }

        @Override
        public int getViewTypeCount() {
            return VIEWTYPE_COUNT;
        }

        @Override
        public int getItemViewType(int position) {
            Cursor cursor = (Cursor) getItem(position);

            return cursor.getInt(ColumnIndices.ROW_TYPE);
        }

        @Override
        public View newView(Context context, Cursor cursor, ViewGroup parent) {
            int viewType = getItemViewType(cursor.getPosition());

            switch (viewType) {
                case VIEWTYPE_RECIPE:
                    return mInflater.inflate(R.layout.item_recipe, parent, false);
                case VIEWTYPE_INGREDIENT:
                    return mInflater.inflate(R.layout.item_ingredient, parent, false);
                default:
                    throw new IllegalStateException("Unexpected view type!");
            }
        }
    }
}
