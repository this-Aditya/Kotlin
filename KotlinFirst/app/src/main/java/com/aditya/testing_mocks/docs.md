To construct an instance of IceCreamMachine, you need to provide an instance of Engine to it.
 Engine itself may be challenging to construct. Engine might perform some actions outside of the
  scope of our test that may affect the test. It may slow down the test or break it. You don’t
  want your unit test failing because the implementation of another class changed.

So how do you provide your IceCreamMachine instance an instance of Engine without using a real
 Engine instance? You can’t create a fake, because you have no way to extend Engine or override
  its functions.

You could update Engine to be an open class and allow all its functions to be overridden.
This is considered bad practice because your code should not be modified to support tests –
let alone tests of another class. It is also a bad idea because it exposes code inside Engine
for modification that would otherwise be protected from such modifications. Lastly, you don’t
always own the dependencies of the class under test, which means you will not always be able
to make such modifications.

This is where mocks become useful.


The definition of a mock
Mocks are classes that have the same interface as their real counterparts, but none of their behavior. Instead, mocks can be configured with stubbed behavior. Stubbing means providing a dummy implementation. For example, a function that is returning an integer can be stubbed to always return the value 0.

Mocks can also be used to verify interactions. An example using Kotlin Mockito (with Mockito-inline, which adds support for mocking final classes) looks like this:

`val mockEngine: Engine = mock() `

The above creates a mock of Engine. Kotlin Mockito uses generics to return the right type of mock. The mock engine will work just like a real engine, allowing IceCreamMachine to be instantiated with it:

`al classUnderTest = IceCreamMachine(mockEngine)`


