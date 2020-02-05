/*
 * Copyright (C) 2019 The LineageOS Project
 *               2019 Paranoid Android
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package co.aospa.popupcamera;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.os.UserHandle;
import android.util.Log;

import java.util.List;

public class PopupCameraUtils {

    private static final String TAG = "PopupCameraUtils";
    private static final boolean DEBUG = false;

    public static void startService(Context context) {
        context.startServiceAsUser(new Intent(context, PopupCameraService.class),
                UserHandle.CURRENT);
    }
}
