package developer.app.ctutorial;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;

public class Main2Activity extends Activity  implements communicator{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void respond(String data) {
        FragmentManager manager=getFragmentManager();
        FragmentB f2= (FragmentB) manager.findFragmentById(R.id.fragment2);
        f2.changeText(data);
    }
}
