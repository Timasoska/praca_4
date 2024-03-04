package com.example.prac_2_4;

import android.os.Parcel;
import android.os.Parcelable;

public class MyData implements Parcelable {
    private String name;
    private int age;

    public MyData(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected MyData(Parcel in) {
        name = in.readString();
        age = in.readInt();
    }

    public static final Creator<MyData> CREATOR = new Creator<MyData>() {
        @Override
        public MyData createFromParcel(Parcel in) {
            return new MyData(in);
        }

        @Override
        public MyData[] newArray(int size) {
            return new MyData[size];
        }
    };

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(age);
    }
}
