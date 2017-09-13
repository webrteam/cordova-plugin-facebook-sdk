package cordova.plugin;

import org.json.JSONArray;
import org.json.JSONException;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import android.util.Log;

public class Test1 extends CordovaPlugin {

    @Override
    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
        // your init code here
    }

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext ctx) throws JSONException {
        if (action.equals("show")) {
            String message = args.getString(0);
            this.show(message, ctx);
            return true;
        }
        return false;
    }

    private void show (String message, CallbackContext ctx) {
        if (message.equals("shanyin")) {
            ctx.success("success");
        } else {
            ctx.error("err");
        }
    }
}