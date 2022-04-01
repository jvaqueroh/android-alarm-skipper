package com.sevensoft.customalarm

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast
import android.app.AlarmManager
import android.app.AlarmManager.RTC
import android.app.PendingIntent
import android.app.PendingIntent.FLAG_ONE_SHOT
import java.util.*

private const val TAG = "AlarmBroadcastReceiver"
private const val timeSpanMillis = 60 * 1000

class AlarmBroadcastReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.
        val alarmManager = context.getSystemService(Context.ALARM_SERVICE) as AlarmManager
        val nextAlarm = Date(alarmManager.nextAlarmClock.triggerTime)

        alarmManager.set(RTC, alarmManager.nextAlarmClock.triggerTime - timeSpanMillis,
            PendingIntent.getActivity(context, 777, Intent(context, MainActivity::class.java), FLAG_ONE_SHOT))
        StringBuilder().apply {
            append("Intent.action: ${intent.action}")
            append("Intent.dataString: ${intent.dataString}")
            append("AlarmInfo: ${alarmManager.nextAlarmClock}\n")
            append("NextAlarm: ${nextAlarm}\n")
            toString().also {
                Log.d(TAG, it)
                Toast.makeText(context, it, Toast.LENGTH_LONG).show()
            }
        }
    }
}