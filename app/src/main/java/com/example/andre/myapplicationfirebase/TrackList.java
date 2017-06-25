package com.example.andre.myapplicationfirebase;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by andre on 25-Jun-17.
 */

public class TrackList extends ArrayAdapter<Track> {
    private Activity context;
    List<Track> tracks;

    public TrackList(Activity context, List<Track> tracks)
    {
        super(context, R.layout.layout_track_list, tracks);
        this.context = context;
        this.tracks = tracks;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();

        View listViewItem = inflater.inflate(R.layout.layout_track_list, null, true);

        TextView textViewName =  (TextView) listViewItem.findViewById(R.id.textViewName);
        TextView textViewRating =  (TextView) listViewItem.findViewById(R.id.textViewRating);

        Track track = tracks.get(position);

        textViewName.setText(track.getTrackName());
        textViewRating.setText(String.valueOf(track.getTrackRating()));

        return listViewItem;
    }
}
