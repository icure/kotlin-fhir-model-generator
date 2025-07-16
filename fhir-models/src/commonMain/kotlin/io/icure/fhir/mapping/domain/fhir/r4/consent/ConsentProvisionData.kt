//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.consent

import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Data controlled by this rule
 *
 * The resources controlled by this rule if specific resources are referenced.
 *
 * @param id Unique id for inter-element referencing
 * @param meaning instance | related | dependents | authoredby
 * @param reference The actual data reference
 */
@SerialName("ConsentProvisionData")
@Serializable
public data class ConsentProvisionData(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * instance | related | dependents | authoredby
   */
  public val meaning: String? = null,
  /**
   * The actual data reference
   */
  public val reference: Reference,
) : BackboneElement
