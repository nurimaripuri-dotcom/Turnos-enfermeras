package io.github.nurimaripuri.turnosenf;

import android.os.Bundle;
import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        registerPlugin(AppInfoPlugin.class);
        super.onCreate(savedInstanceState);
    }
}
