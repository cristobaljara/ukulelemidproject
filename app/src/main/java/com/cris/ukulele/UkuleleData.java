package com.cris.ukulele;

/**
 * Created by crisp_000 on 08-02-2018.
 */

public class UkuleleData {

    private String mDataArtist;
    private String mDataTitle;
    private String mDataSong;

    public UkuleleData(String mDataArtist, String mDataTitle, String mDataSong) {
        this.mDataArtist = mDataArtist;
        this.mDataTitle = mDataTitle;
        this.mDataSong = mDataSong;
    }

    public String getmDataArtist() {
        return mDataArtist;
    }

    public String getmDataTitle() {
        return mDataTitle;
    }

    public String getmDataSong() {
        return mDataSong;
    }
}
