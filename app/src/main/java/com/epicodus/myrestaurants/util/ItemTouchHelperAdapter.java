package com.epicodus.myrestaurants.util;

/**
 * Created by Guest on 7/17/16.
 */
public interface ItemTouchHelperAdapter {
    boolean onItemMove(int fromPosition, int toPosition);
    void onItemDismiss(int position);
}
