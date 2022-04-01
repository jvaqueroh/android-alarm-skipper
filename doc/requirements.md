# Alarm advisor app
## Description
1. Allow the user to cancel next clock alarm some time before it is fired.
2. Only if the user activates the device in the configured range of time.
3. Ideally show a floating widget to cancel the alarm with a simple touch.
4. If canceled alarm is a repetition alarm, ensure the alarm will be active for the next time

<br>

## Tasks
### MVP
1. Automatically prepare the "cancellation advice" for "next alarm".
   - Ideally when this app is installed.
   - Alternatively on first time this app is executed.
2. Prepare the "cancel next alarm advice" to be shown configured time before the alarm is fired.
3. Show floating widget to allow the user to cancel "next alarm".
4. Cancel "next alarm" when user confirms
5. Subscribe to "next alarm changed".
6. Reset the canceled alarm if it is an alarm with repetitions.

### Other features
1. Allow the user to configure the time interval for the "cancellation advice" to be shown.
   - App is distributed with a default time interval of 5 minutes
2. Reset current "cancellation advice" if the user changes the time interval setting
