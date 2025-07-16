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

/**
 * A test executed from the test script
 *
 * A test executed from the test script.
 *
 * @param id Unique id for inter-element referencing
 * @param name Tracking/logging name of this test
 * @param description Tracking/reporting short description of the test
 */
@SerialName("TestReportTest")
@Serializable
public data class TestReportTest(
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
  public val action: List<TestReportTestAction> = emptyList(),
) : BackboneElement
