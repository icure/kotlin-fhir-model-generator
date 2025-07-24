//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.allergyintolerance

import com.icure.fhir.mapping.domain.fhir.r4.`annotation`.Annotation
import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Adverse Reaction Events linked to exposure to substance
 *
 * Details about each adverse reaction event linked to exposure to the identified substance.
 *
 * @param id Unique id for inter-element referencing
 * @param substance Specific substance or pharmaceutical product considered to be responsible for
 * event
 * @param description Description of the event as a whole
 * @param onset Date(/time) when manifestations showed
 * @param severity mild | moderate | severe (of event as a whole)
 * @param exposureRoute How the subject was exposed to the substance
 */
@SerialName("AllergyIntoleranceReaction")
@Serializable
public data class AllergyIntoleranceReaction(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Specific substance or pharmaceutical product considered to be responsible for event
   */
  public val substance: CodeableConcept? = null,
  public val manifestation: List<CodeableConcept> = emptyList(),
  /**
   * Description of the event as a whole
   */
  public val description: String? = null,
  /**
   * Date(/time) when manifestations showed
   */
  public val onset: String? = null,
  /**
   * mild | moderate | severe (of event as a whole)
   */
  public val severity: String? = null,
  /**
   * How the subject was exposed to the substance
   */
  public val exposureRoute: CodeableConcept? = null,
  public val note: List<Annotation> = emptyList(),
) : BackboneElement
