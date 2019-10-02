package ru.system.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author Gevork Safaryan on 2019-10-01
 */
class MainParcel implements Parcelable {

    public static final Creator<MainParcel> CREATOR = new Creator<MainParcel>() {
        @Override
        public MainParcel createFromParcel(Parcel in) {
            return new MainParcel(in);
        }

        @Override
        public MainParcel[] newArray(int size) {
            return new MainParcel[size];
        }
    };

    public MainParcel() {

    }

    protected MainParcel(Parcel in) {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }
}
