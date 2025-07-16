//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.testscript

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A series of required clean up steps
 *
 * A series of operations required to clean up after all the tests are executed (successfully or
 * otherwise).
 *
 * @param id Unique id for inter-element referencing
 */
@SerialName("TestScriptTeardown")
@Serializable
public data class TestScriptTeardown(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val action: List<TestScriptTeardownAction> = emptyList(),
) : BackboneElement
