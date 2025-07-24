//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.testscript

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A series of required setup operations before tests are executed
 *
 * A series of required setup operations before tests are executed.
 *
 * @param id Unique id for inter-element referencing
 */
@SerialName("TestScriptSetup")
@Serializable
public data class TestScriptSetup(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val action: List<TestScriptSetupAction> = emptyList(),
) : BackboneElement
