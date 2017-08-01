package com.shenni.torontofoods.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.shenni.torontofoods.MyApplication;
import com.shenni.torontofoods.model.PagerInfo;

import java.util.List;

/**
 * Created by Ocean on 6/22/16.
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {

    List<PagerInfo> mDataSource;

    public ViewPagerAdapter(FragmentManager fm, List<PagerInfo> dataSource) {
        super(fm);
        mDataSource = dataSource;
    }

    @Override
    public Fragment getItem(int position) {
        if(position < mDataSource.size()){
            return mDataSource.get(position).getFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return mDataSource.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return MyApplication.getInstance().getString(mDataSource.get(position).getTitleResId());
    }
}
