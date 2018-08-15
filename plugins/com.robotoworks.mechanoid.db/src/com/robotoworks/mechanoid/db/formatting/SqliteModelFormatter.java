/*
 * generated by Xtext
 */
package com.robotoworks.mechanoid.db.formatting;

import com.robotoworks.mechanoid.db.services.SqliteModelGrammarAccess;

import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;

/**
 * This class contains custom formatting description.
 * <p>
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#formatting
 * on how and when to use it
 * <p>
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
public class SqliteModelFormatter extends AbstractDeclarativeFormatter {

    @Override
    protected void configureFormatting(FormattingConfig c) {
        SqliteModelGrammarAccess g = (SqliteModelGrammarAccess) getGrammarAccess();

        c.setLinewrap(0, 1, 2).before(g.getSL_COMMENTRule());
        c.setLinewrap(0, 1, 2).before(g.getML_COMMENTRule());
        c.setLinewrap(0, 1, 1).after(g.getML_COMMENTRule());

        //
        // PACKAGE
        //
        c.setLinewrap(2).after(g.getModelAccess().getPackageNameAssignment_1());

        //
        // DATABASE BLOCK
        //
        c.setLinewrap().after(g.getDatabaseBlockAccess().getLeftCurlyBracketKeyword_2());
        c.setLinewrap().before(g.getDatabaseBlockAccess().getRightCurlyBracketKeyword_6());


        //
        // MIGRATION BLOCKS
        //
        c.setIndentationIncrement().before(g.getMigrationBlockRule());
        c.setLinewrap(2).before(g.getMigrationBlockRule());
        c.setLinewrap().after(g.getMigrationBlockAccess().getLeftCurlyBracketKeyword_2());
        c.setLinewrap().before(g.getMigrationBlockAccess().getRightCurlyBracketKeyword_4());
        c.setNoSpace().before(g.getMigrationBlockAccess().getSemicolonKeyword_3_1());
        c.setIndentationDecrement().after(g.getMigrationBlockRule());

        //
        // DDL STATEMENTS
        //
        c.setLinewrap(2).before(g.getDDLStatementRule());
        c.setIndentationIncrement().before(g.getDDLStatementRule());
        c.setIndentationDecrement().after(g.getDDLStatementRule());

        c.setLinewrap().before(g.getCreateTableStatementAccess().getRightParenthesisKeyword_9());
        c.setIndentationIncrement().after(g.getCreateTableStatementAccess().getLeftParenthesisKeyword_5());
        c.setIndentationDecrement().before(g.getCreateTableStatementAccess().getRightParenthesisKeyword_9());
        c.setLinewrap().before(g.getColumnDefRule());
        c.setNoSpace().before(g.getCreateTableStatementAccess().getCommaKeyword_7_0());

        c.setLinewrap().before(g.getDMLStatementRule());
        c.setLinewrap().before(g.getResultColumnRule());

        c.setLinewrap().before(g.getSelectExpressionAccess().getSelectKeyword_1());
        c.setLinewrap().after(g.getSelectExpressionAccess().getSelectKeyword_1());
        c.setLinewrap().before(g.getSelectExpressionAccess().getFromKeyword_4_0());
        c.setLinewrap().before(g.getSelectExpressionAccess().getWhereKeyword_5_0());
        c.setLinewrap().before(g.getSelectExpressionAccess().getGroupByKeyword_6_0());
        c.setLinewrap().before(g.getSelectExpressionAccess().getHavingKeyword_7_0());
        c.setLinewrap().before(g.getSelectStatementAccess().getOrderByKeyword_1_0());
        c.setLinewrap().before(g.getSelectStatementAccess().getLimitKeyword_2_0());

        c.setIndentationIncrement().before(g.getSelectListAccess().getRule());
        c.setIndentationDecrement().after(g.getSelectListAccess().getRule());
        c.setNoSpace().before(g.getSelectListAccess().getCommaKeyword_1_0());

        c.setLinewrap().before(g.getJoinStatementRule());

        c.setLinewrap().before(g.getCompoundOperatorRule());
        c.setLinewrap().before(g.getCreateTriggerStatementAccess().getWhenExpressionAssignment_9_1());

        c.setIndentationIncrement().after(g.getCreateViewStatementAccess().getAsKeyword_5());
        c.setIndentationDecrement().after(g.getCreateViewStatementRule());

        c.setLinewrap().after(g.getExprAndAccess().getOpAndKeyword_1_1_0());
        c.setLinewrap().after(g.getExprOrAccess().getOpOrKeyword_1_1_0());
        c.setLinewrap().after(g.getCaseRule());
        c.setNoSpace().after(g.getPrimaryExpressionAccess().getSourceAssignment_2_1_0_0());
        c.setNoSpace().after(g.getPrimaryExpressionAccess().getSourceAssignment_2_1_1_0());
        c.setNoSpace().before(g.getPrimaryExpressionAccess().getColumnAssignment_0_2());
        c.setNoSpace().before(g.getPrimaryExpressionAccess().getColumnAssignment_1_2());
        c.setNoSpace().before(g.getPrimaryExpressionAccess().getColumnAssignment_2_1_1_2_1());
        c.setNoSpace().before(g.getPrimaryExpressionAccess().getColumnAssignment_2_1_2());
    }
}
