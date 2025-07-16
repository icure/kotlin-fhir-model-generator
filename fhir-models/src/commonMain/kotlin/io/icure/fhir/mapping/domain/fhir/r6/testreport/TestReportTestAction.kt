//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.testreport

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames

/**
 * A test operation or assert that was performed
 *
 * Action would contain either an operation or an assertion.
 *
 * @param id Unique id for inter-element referencing
 * @param operation The operation performed
 * @param assert_fhir The assertion performed
 */
@SerialName("TestReportTestAction")
@Serializable
public data class TestReportTestAction(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The operation performed
   */
  public val operation: TestReportSetupActionOperation? = null,
  /**
   * The assertion performed
   */
  @JsonNames("assert")
  public val assert_fhir: TestReportSetupActionAssert? = null,
) : BackboneElement
