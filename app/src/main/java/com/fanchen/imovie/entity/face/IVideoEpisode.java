package com.fanchen.imovie.entity.face;

import android.os.Parcelable;

/**
 * Created by fanchen on 2017/9/25.
 */
public interface IVideoEpisode extends IViewType,Parcelable{

    /**
     * 使用网页播放
     */
    int PLAY_TYPE_WEB = 1;
    /**
     * 可直接播放
     */
    int PLAY_TYPE_VIDEO = 2;
    /**
     * 需求请求url获取播放地址
     */
    int PLAY_TYPE_URL = 3;

    int PLAY_TYPE_XUNLEI = 4;
    /**
     * zzplayer系统自带Videoview在线播放
     */
    int PLAY_TYPE_ZZPLAYER = 5;
    /**
     * 不支持在线播放
     */
    int PLAY_TYPE_NOT = -1;

    int DOWNLOAD_SELECT = -1;
    int DOWNLOAD_NON = 0;
    int DOWNLOAD_RUN = 1;
    int DOWNLOAD_SUCCESS = 2;
    int DOWNLOAD_ERROR = 3;
    /**
     *
     * @return
     */
    String getTitle();

    /**
     *
     * @return
     */
    String getUrl();

    /**
     *
     * @return
     */
    String getId();

    /**
     *
     * @return
     */
    int getSource();

    /**
     *
     * @return
     */
    int getPlayerType();

    /**
     *
     * @return
     */
    String getExtend();

    /**
     *
     * @return
     */
    String getServiceClassName();

    /**
     *
     * @return
     */
    int getDownloadState();

    /**
     *
     * @param state
     */
    void setDownloadState(int state);

    /**
     * 本地文件
     */
    void setFilePath(String path);
}
