package com.aditya.testing_mocks

import org.junit.Assert.*
import org.junit.Test
import org.mockito.BDDMockito.given
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify

class IceCreamMachineTest {
    private val mockEngine: Engine = mock()

    private val classUnderTest = IceCreamMachine(mockEngine)

    @Test
    fun `test power up` () {
//        given {mockEngine.getVoltage()}.willReturn ( "Some Value" )
        classUnderTest.powerUp()
        val voltage =  classUnderTest.getVoltage()
        verify(mockEngine).powerUp()
        verify(mockEngine).getVoltage()
//        assertEquals("Some Value", voltage)
    }
}