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
 * Links or references to the testing requirements
 *
 * Links or references providing traceability to the testing requirements for this assert.
 *
 * @param id Unique id for inter-element referencing
 * @param linkUri Link or reference to the testing requirement
 * @param linkCanonical Link or reference to the testing requirement
 */
@SerialName("TestScriptSetupActionAssertRequirement")
@Serializable
public data class TestScriptSetupActionAssertRequirement(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Link or reference to the testing requirement
   */
  public val linkUri: String? = null,
  /**
   * Link or reference to the testing requirement
   */
  public val linkCanonical: String? = null,
) : BackboneElement
