package com.rumbleworks.classnote;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class AnnouncementListFragment extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    public static final String ARG_SECTION_NUMBER = "section_number";

    public AnnouncementListFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_announcement_list, container, false);
        //TextView dummyTextView = (TextView) rootView.findViewById(R.id.section_label);
        //dummyTextView.setText(Integer.toString(getArguments().getInt(ARG_SECTION_NUMBER)));
        //View topLevelLayout = rootfindViewById(R.id.top_layout);
        //topLevelLayout.setVisibility(View.INVISIBLE);
        return rootView;
    }
}