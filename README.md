# AndroidNotificationModule
Android Notification Module in Java language + Single UI with button to test it

# **Usage**
1. **Put NotificationModule class in your app folder**
2. **Use the following in the place you want ot fire a notification**; substitute the i/p parameters by their equivalent in your project
** **
    // Making an instance of the module
    NotificationModule notification= new NotificationModule("NotificationTitle","NotificationContent","NotificationName",R.drawable.ic_launcher_foreground,MainActivity.this,CHANNEL_ID);

    // Firing a notification
    notification.fireNotification();
- - - - 
