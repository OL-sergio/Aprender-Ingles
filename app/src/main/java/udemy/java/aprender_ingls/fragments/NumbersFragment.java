package udemy.java.aprender_ingls.fragments;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import udemy.java.aprender_ingls.R;


public class NumbersFragment extends Fragment implements View.OnClickListener {

    private MediaPlayer mediaPlayer;

    public NumbersFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_numbers, container, false);

        ImageView imageViewUm = view.findViewById(R.id.imageView_numberUm);
        ImageView imageViewDois = view.findViewById(R.id.imageView_numberDois);
        ImageView imageViewTres = view.findViewById(R.id.imageView_numberTres);
        ImageView imageViewQuatro = view.findViewById(R.id.imageView_numberQuartro);
        ImageView imageViewCinco = view.findViewById(R.id.imageView_numberCinco);
        ImageView imageViewSeis = view.findViewById(R.id.imageView_numberSeis);

        imageViewUm.setOnClickListener(this);
        imageViewDois.setOnClickListener(this);
        imageViewTres.setOnClickListener(this);
        imageViewQuatro.setOnClickListener(this);
        imageViewCinco.setOnClickListener(this);
        imageViewSeis.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imageView_numberUm:
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.one);
                tocarSonsNumeros();
                break;

            case R.id.imageView_numberDois:
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.two);
                tocarSonsNumeros();
                break;

            case R.id.imageView_numberTres:
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.three);
                tocarSonsNumeros();
                break;

            case R.id.imageView_numberQuartro:
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.four);
                tocarSonsNumeros();
                break;

            case R.id.imageView_numberCinco:
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.five);
                tocarSonsNumeros();
                break;

            case R.id.imageView_numberSeis:
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.six);
                tocarSonsNumeros();
                break;

        }
    }

    private void tocarSonsNumeros() {
        if (mediaPlayer != null){
         mediaPlayer.start();

         mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
             @Override
             public void onCompletion(MediaPlayer mp) {
                 mp.release();
             }
         });
        }
    }
}