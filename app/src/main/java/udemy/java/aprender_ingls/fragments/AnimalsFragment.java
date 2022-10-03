package udemy.java.aprender_ingls.fragments;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import udemy.java.aprender_ingls.R;

public class AnimalsFragment extends Fragment implements View.OnClickListener{

    private MediaPlayer mediaPlayer;

    public AnimalsFragment() {
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
       View view = inflater.inflate(R.layout.fragment_animals, container, false);

        ImageView imageViewCao = view.findViewById(R.id.imageView_animalCao);
        ImageView imageViewGato = view.findViewById(R.id.imageView_animalGato);
        ImageView imageViewLeao = view.findViewById(R.id.imageView_animalLeao);
        ImageView imageViewVaca = view.findViewById(R.id.imageView_animalVaca);
        ImageView imageViewMacaco = view.findViewById(R.id.imageView_animalMacaco);
        ImageView imageViewOvelha = view.findViewById(R.id.imageView_animalOvelha);

        imageViewCao.setOnClickListener(this);
        imageViewGato.setOnClickListener(this);
        imageViewLeao.setOnClickListener(this);
        imageViewVaca.setOnClickListener(this);
        imageViewMacaco.setOnClickListener(this);
        imageViewOvelha.setOnClickListener(this);




        return view;
    }

    @Override
    public void onClick(View view) {
        //Log.i("Elemento clicado","Item" + view.getId() );

        switch ( view.getId()) {
            case R.id.imageView_animalCao:
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.dog);
                torcarSons();
                break;

            case R.id.imageView_animalGato:
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.cat);
                torcarSons();
                break;

            case R.id.imageView_animalLeao:
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.lion);
                torcarSons();
                break;

            case R.id.imageView_animalMacaco:
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.monkey);
                torcarSons();
                break;

            case R.id.imageView_animalVaca:
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.cow);
                torcarSons();
                break;

            case R.id.imageView_animalOvelha:
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.sheep);
                torcarSons();
                break;

        }
    }

    private void torcarSons() {
        if ( mediaPlayer != null){
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