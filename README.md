****************** TestUtils.java v0.13 *****************
TestUtils (a.k.a TestUtils.java) is an actively developed class library for
Java. It features methods for debugging under the Debugator class, and will 
feature more utilities in newer releases.

To include TestUtils on your project, just add TestUtils.jar on its libraries
(just right-click the Libraries on NetBeans or Eclipse). Then, add this line on the files where you want to use the library:

    import com.testapp.testutils.*;

Currently developed:
- com.testapp.testutils.Debugator → The main class. It hosts methods which
can help you debugging your application.
- com.testapp.testutils.Debugator.kInstantiator → A control variable. The
0.13 version features its own controller, named com.testapp.testutils.Debuga-
tor.kController. Calling kController returns you the state of the kInstantiator
variable. With the 'true' parameter, it sets the variable to false. To avoid
that, use the 'false' parameter.

Further help:
We're on the #testutils channel, at Freenode.
