package com.example.foody.ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;

import com.example.foody.R;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class NotificationsFragment extends Fragment {
    TabLayout tabLayout;
    TabItem tabItem1, tabItem2,tabItem3;
    ViewPager viewPager;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_notifications, container, false);
        tabLayout = (TabLayout) root.findViewById(R.id.tablayout1);
        tabItem1 = (TabItem) root.findViewById(R.id.tab1);
        tabItem2 = (TabItem) root.findViewById(R.id.tab2);
        tabItem3 = (TabItem) root.findViewById(R.id.tab3);

        viewPager= root.findViewById(R.id.vpager);
        return root;
    }
}