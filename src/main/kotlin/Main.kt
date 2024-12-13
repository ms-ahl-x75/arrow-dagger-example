@file:Suppress("unused", "UNUSED_PARAMETER")

package org.example

import arrow.core.Nel
import arrow.core.NonEmptySet
import dagger.Component
import javax.inject.Inject

fun main() {
}

@Component
interface ArrowComponent {
  fun dependency(): ArrowDependency
}

class ArrowDependency @Inject constructor() {
  fun valueClassFunctionNel(nel: Nel<Unit>) = Unit
  fun valueClassFunctionNes(nes: NonEmptySet<Unit>) = Unit
}
