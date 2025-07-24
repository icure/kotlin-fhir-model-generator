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

/**
 * The assertion to perform
 *
 * The results of the assertion performed on the previous operations.
 *
 * @param id Unique id for inter-element referencing
 * @param result pass | skip | fail | warning | error
 * @param message A message associated with the result
 * @param detail A link to further details on the result
 */
@SerialName("TestReportSetupActionAssert")
@Serializable
public data class TestReportSetupActionAssert(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * pass | skip | fail | warning | error
   */
  public val result: String? = null,
  /**
   * A message associated with the result
   */
  public val message: String? = null,
  /**
   * A link to further details on the result
   */
  public val detail: String? = null,
  public val requirement: List<TestReportSetupActionAssertRequirement> = emptyList(),
) : BackboneElement
