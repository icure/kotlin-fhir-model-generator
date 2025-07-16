//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.medicationknowledge

import io.icure.fhir.mapping.domain.fhir.r6.`annotation`.Annotation
import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.duration.Duration
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * How the medication should be stored
 *
 * Information on how the medication should be stored, for example, refrigeration temperatures and
 * length of stability at a given temperature.
 *
 * @param id Unique id for inter-element referencing
 * @param reference Reference to additional information
 * @param stabilityDuration Duration remains stable
 */
@SerialName("MedicationKnowledgeStorageGuideline")
@Serializable
public data class MedicationKnowledgeStorageGuideline(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Reference to additional information
   */
  public val reference: String? = null,
  public val note: List<Annotation> = emptyList(),
  /**
   * Duration remains stable
   */
  public val stabilityDuration: Duration? = null,
  public val environmentalSetting: List<MedicationKnowledgeStorageGuidelineEnvironmentalSetting> =
      emptyList(),
) : BackboneElement
