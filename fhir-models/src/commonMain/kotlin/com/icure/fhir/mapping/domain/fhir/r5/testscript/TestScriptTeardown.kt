//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.testscript

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
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
