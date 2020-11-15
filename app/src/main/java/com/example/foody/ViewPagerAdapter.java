package com.example.foody;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.foody.ui.Profile.profileFragment;
import com.example.foody.ui.history.historyFragment;
import com.example.foody.ui.home.HomeFragment;
import com.example.foody.ui.notifications.NotificationsFragment;
import com.example.foody.ui.saved.savedFragment;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new HomeFragment();
            case 1:
                return new savedFragment();
            case 2:
                return new historyFragment();
            case 3:
                return new NotificationsFragment();
            case 4:
                return new profileFragment();
            default:
                return new HomeFragment();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }
}
