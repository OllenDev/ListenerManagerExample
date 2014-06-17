ListenerManagerExample
======================

Sample of the Listener Manager Pattern

This pattern is useful for managing a central piece of data and then notifying multiple listeners when it is updated.

This example only has one listener registered, however it I think it gets the point accross.

One downside of this pattern and specifically Android Activities and Fragments is that you have to register and un-register the listener as the components go through their life cycle. Failure to unregister can result in a null pointer exception.
