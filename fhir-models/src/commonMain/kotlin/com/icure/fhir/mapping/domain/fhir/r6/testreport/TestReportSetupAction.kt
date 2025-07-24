//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.testreport

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames

/**
 * A setup operation or assert that was executed
 *
 * Action would contain either an operation or an assertion.
 *
 * @param id Unique id for inter-element referencing
 * @param operation The operation to perform
 * @param assert_fhir The assertion to perform
 */
@SerialName("TestReportSetupAction")
@Serializable
public data class TestReportSetupAction(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The operation to perform
   */
  public val operation: TestReportSetupActionOperation? = null,
  /**
   * The assertion to perform
   */
  @JsonNames("assert")
  public val assert_fhir: TestReportSetupActionAssert? = null,
) : BackboneElement
