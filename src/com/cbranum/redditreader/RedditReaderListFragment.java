package com.cbranum.redditreader;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;

/**
 * Simple Activity List Fragment
 * @author cbranum
 */
public class RedditReaderListFragment extends ListFragment {
	
	// the data that will populate the list view is a string array
	protected String[] listItems;
	
	// populate the list items array
	protected void createListItems() {
		listItems = new String[12];
		listItems[0]  = "Uno";
		listItems[1]  = "Dos";
		listItems[2]  = "Tres";
		listItems[3]  = "Cuatro";
		listItems[4]  = "Cinco";
		listItems[5]  = "Seis";
		listItems[6]  = "Siete";
		listItems[7]  = "Ocho";
		listItems[8]  = "Nueve";
		listItems[9]  = "Diez";
		listItems[10] = "Once";
		listItems[11] = "Doce";
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// extend parent method
		super.onCreate(savedInstanceState);
		
		// populate the listItems array
		createListItems();
		
		// create the array adapter
		ListAdapter listAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, listItems);
		
		// set it
		setListAdapter(listAdapter);
	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// inflate and return the view
		boolean attachToRoot = false;
		return inflater.inflate(R.layout.list_fragment, container, attachToRoot);
	}
}
