package in.samcodes.videodemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    VideoView videoView;
    MediaController mediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videoView= findViewById(R.id.videoView);
        mediaController= new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.setVideoPath("android.resource://"+ getPackageName()+"/"+R.raw.catvideo);
        videoView.start();
    }
}