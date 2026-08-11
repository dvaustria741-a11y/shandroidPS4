package org.shadps4.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

// Placeholder Activity. The native core is currently built by the existing
// root CMakeLists.txt as a desktop-style executable target ("shadps4"), not
// as a shared library, so there is no JNI entry point wired up yet. Once the
// native build succeeds for Android, this Activity should be replaced with a
// SurfaceView + JNI bridge into the emulator core.
public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("shadPS4 Android scaffold build");
        setContentView(tv);
    }
}
