//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.testreport

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The results of the series of required setup operations before the tests were executed
 *
 * The results of the series of required setup operations before the tests were executed.
 *
 * @param id Unique id for inter-element referencing
 */
@SerialName("TestReportSetup")
@Serializable
public data class TestReportSetup(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val action: List<TestReportSetupAction> = emptyList(),
) : BackboneElement
