//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.evidencereport

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Target of the relationship
 *
 * The target composition/document of this relationship.
 *
 * @param id Unique id for inter-element referencing
 * @param url Target of the relationship URL
 * @param identifier Target of the relationship Identifier
 * @param display Target of the relationship Display
 * @param resource Target of the relationship Resource reference
 */
@SerialName("EvidenceReportRelatesToTarget")
@Serializable
public data class EvidenceReportRelatesToTarget(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Target of the relationship URL
   */
  public val url: String? = null,
  /**
   * Target of the relationship Identifier
   */
  public val identifier: Identifier? = null,
  /**
   * Target of the relationship Display
   */
  public val display: String? = null,
  /**
   * Target of the relationship Resource reference
   */
  public val resource: Reference? = null,
) : BackboneElement
