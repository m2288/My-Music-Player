package pro.niyaz.mymusicplayer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    SeekBar seekBar;

    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer = MediaPlayer.create(this, R.raw.musicfile);
        float progress = ((float) mediaPlayer.getCurrentPosition() / mediaPlayer.getDuration()) * 100;
        System.out.println(progress);
    }

    public void onMusicPlayClick(View view) {
        mediaPlayer.start();
    }

    public void onMusicPauseClick(View view) {
        mediaPlayer.pause();
    }
}