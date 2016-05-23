package developer.app.ctutorial;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by SONY on 5/14/2016.
 */
public class FragmentB extends Fragment {
    TextView text;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_b,container,false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        text= (TextView)getActivity().findViewById(R.id.textView);
    }
    public void changeText(String data){
        text.setText(data);


    }
}
