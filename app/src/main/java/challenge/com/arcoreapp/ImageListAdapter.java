package challenge.com.arcoreapp;

import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ImageListAdapter extends RecyclerView.Adapter<ImageListAdapter.ViewHolder> {


    private final OnListInteractionListener mListener;

    ImageListAdapter(OnListInteractionListener listener) {
        mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.image_list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        switch (position) {
            case 0:
                holder.mView.setImageResource(R.drawable.heart);
                break;
            case 1:
                holder.mView.setImageResource(R.drawable.smile);
                break;
            case 2:
                holder.mView.setImageResource(R.drawable.wow);
                break;
            case 3:
                holder.mView.setImageResource(R.drawable.ice);
                break;
            case 4:
                holder.mView.setImageResource(R.drawable.cloud);
                break;
            case 5:
                holder.mView.setImageResource(R.drawable.star);
                break;
            case 6:
                holder.mView.setImageResource(R.drawable.pumpkin);
                break;
        }
        holder.mView.setOnClickListener(v -> {
            if (null != mListener) {
                // Notify the active callbacks interface (the activity, if the
                // fragment is attached to one) that an item has been selected.
                switch (position) {
                    case 0:
                        mListener.onListInteraction(Uri.parse("emoji_heart_anim.sfb"));
                        break;
                    case 1:
                        mListener.onListInteraction(Uri.parse("emoji_smile_anim_a.sfb"));
                        break;
                    case 2:
                        mListener.onListInteraction(Uri.parse("emoji_wow_anim.sfb"));
                        break;
                    case 3:
                        mListener.onListInteraction(Uri.parse("icecreamman_anim_a.sfb"));
                        break;
                    case 4:
                        mListener.onListInteraction(Uri.parse("object_cloud_anim.sfb"));
                        break;
                    case 5:
                        mListener.onListInteraction(Uri.parse("object_star_anim.sfb"));
                        break;
                    case 6:
                        mListener.onListInteraction(Uri.parse("pumpkinman_anim.sfb"));
                        break;
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return 7;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        final ImageView mView;

        ViewHolder(View view) {
            super(view);
            mView = (ImageView) view;

        }

        @Override
        public String toString() {
            return super.toString();
        }
    }

}