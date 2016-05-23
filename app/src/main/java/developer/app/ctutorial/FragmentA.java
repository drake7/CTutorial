package developer.app.ctutorial;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import developer.app.ctutorial.R;

/**
 * Created by SONY on 5/14/2016.
 */
public class FragmentA extends Fragment  implements View.OnClickListener{
    Button btn1;
    int counter=0;
    communicator comm;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_a,container,false);

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        btn1=  (Button)getActivity().findViewById(R.id.button);
        comm=  (communicator)getActivity();
        btn1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        counter++;
        comm.respond("button was clicked"+counter+"times");
    }
}
