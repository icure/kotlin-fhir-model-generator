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
 * A test in this script
 *
 * A test in this script.
 *
 * @param id Unique id for inter-element referencing
 * @param name Tracking/logging name of this test
 * @param description Tracking/reporting short description of the test
 */
@SerialName("TestScriptTest")
@Serializable
public data class TestScriptTest(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Tracking/logging name of this test
   */
  public val name: String? = null,
  /**
   * Tracking/reporting short description of the test
   */
  public val description: String? = null,
  public val action: List<TestScriptTestAction> = emptyList(),
) : BackboneElement
