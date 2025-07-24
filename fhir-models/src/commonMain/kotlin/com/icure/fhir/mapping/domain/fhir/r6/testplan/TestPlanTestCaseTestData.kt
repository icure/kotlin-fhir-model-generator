//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.testplan

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.coding.Coding
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The test data used in the test case
 *
 * The test data used in the test case.
 *
 * @param id Unique id for inter-element referencing
 * @param type The type of test data description, e.g. 'synthea'
 * @param content The actual test resources when they exist
 * @param sourceString Pointer to a definition of test resources - narrative or structured e.g.
 * synthetic data generation, etc
 * @param sourceReference Pointer to a definition of test resources - narrative or structured e.g.
 * synthetic data generation, etc
 */
@SerialName("TestPlanTestCaseTestData")
@Serializable
public data class TestPlanTestCaseTestData(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The type of test data description, e.g. 'synthea'
   */
  public val type: Coding,
  /**
   * The actual test resources when they exist
   */
  public val content: Reference? = null,
  /**
   * Pointer to a definition of test resources - narrative or structured e.g. synthetic data
   * generation, etc
   */
  public val sourceString: String? = null,
  /**
   * Pointer to a definition of test resources - narrative or structured e.g. synthetic data
   * generation, etc
   */
  public val sourceReference: Reference? = null,
) : BackboneElement
