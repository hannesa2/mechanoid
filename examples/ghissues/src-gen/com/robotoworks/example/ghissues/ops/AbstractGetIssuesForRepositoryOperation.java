/*
 * Generated by Robotoworks Mechanoid
 */
package com.robotoworks.example.ghissues.ops;

import com.robotoworks.mechanoid.Mechanoid;
import com.robotoworks.mechanoid.ops.Operation;
import com.robotoworks.mechanoid.ops.OperationResult;
import com.robotoworks.mechanoid.ops.OperationServiceBridge;
import com.robotoworks.mechanoid.ops.OperationConfiguration;
import android.content.Intent;
import android.os.Bundle;

public abstract class AbstractGetIssuesForRepositoryOperation extends Operation {
	public static final String ACTION_GET_ISSUES_FOR_REPOSITORY = "com.robotoworks.example.ghissues.ops.GithubService.actions.GET_ISSUES_FOR_REPOSITORY";

	public static final String EXTRA_OWNER = "com.robotoworks.example.ghissues.ops.GithubService.extras.OWNER";
	public static final String EXTRA_REPO = "com.robotoworks.example.ghissues.ops.GithubService.extras.REPO";

	static class Args {
		public String owner;
		public String repo;
	}
	
	static class Configuration extends OperationConfiguration {
		@Override 
		public Operation createOperation() {
			return new GetIssuesForRepositoryOperation();
		}
		
		@Override
		public Intent findMatchOnConstraint(OperationServiceBridge bridge, Intent intent) {
			Intent existingRequest = bridge.findPendingRequestByActionWithExtras(AbstractGetIssuesForRepositoryOperation.ACTION_GET_ISSUES_FOR_REPOSITORY, intent.getExtras());
			
			return existingRequest;
			
		}
	}
	
	public static final Intent newIntent(String owner, String repo) {
		Intent intent = new Intent(ACTION_GET_ISSUES_FOR_REPOSITORY);
		intent.setClass(Mechanoid.getApplicationContext(), GithubService.class);
		
		Bundle extras = new Bundle();
		extras.putString(EXTRA_OWNER, owner);
		extras.putString(EXTRA_REPO, repo);
		
		intent.putExtras(extras);
		
		return intent;
		
	}

	@Override
	public OperationResult execute() {
		Args args = new Args();
		
		Bundle extras = getIntent().getExtras();
		args.owner = extras.getString(EXTRA_OWNER);
		args.repo = extras.getString(EXTRA_REPO);
		
		return onExecute(args);
	}
			
	protected abstract OperationResult onExecute(Args args);
}
