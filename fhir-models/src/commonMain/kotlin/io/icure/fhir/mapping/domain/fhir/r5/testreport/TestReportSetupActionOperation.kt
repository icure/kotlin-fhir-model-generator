//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.testreport

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The operation to perform
 *
 * The operation performed.
 *
 * @param id Unique id for inter-element referencing
 * @param result pass | skip | fail | warning | error
 * @param message A message associated with the result
 * @param detail A link to further details on the result
 */
@SerialName("TestReportSetupActionOperation")
@Serializable
public data class TestReportSetupActionOperation(
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
) : BackboneElement
