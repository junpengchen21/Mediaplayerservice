package cn.edu.gdmec.s07150705.mediaplayerservice;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.UnsupportedSchemeException;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by Administrator on 2016/11/17 0017.
 */
public class PlayService extends Service{
    MediaPlayer mediaPlayer;
    public PlayService(){
    }
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
  public int onStartCommand(Intent intent,int flags,int startId){
      mediaPlayer.start();
      return super.onStartCommand(intent,flags,startId);
  }
    public void onCreate(){
        super.onCreate();
        mediaPlayer = MediaPlayer.create(this,R.raw.mymusic);
        mediaPlayer.setLooping(true);
    }
    public void onDestory(){
        super.onDestroy();
        mediaPlayer.stop();
        mediaPlayer.release();
    }
}
