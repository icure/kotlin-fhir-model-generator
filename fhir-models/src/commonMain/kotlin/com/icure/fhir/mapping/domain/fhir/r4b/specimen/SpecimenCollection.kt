//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.specimen

import com.icure.fhir.mapping.domain.fhir.r4b.Quantity
import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.duration.Duration
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.period.Period
import com.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Collection details
 *
 * Details concerning the specimen collection.
 *
 * @param id Unique id for inter-element referencing
 * @param collector Who collected the specimen
 * @param collectedDateTime Collection time
 * @param collectedPeriod Collection time
 * @param duration How long it took to collect specimen
 * @param quantity The quantity of specimen collected
 * @param method Technique used to perform collection
 * @param bodySite Anatomical collection site
 * @param fastingStatusCodeableConcept Whether or how long patient abstained from food and/or drink
 * @param fastingStatusDuration Whether or how long patient abstained from food and/or drink
 */
@SerialName("SpecimenCollection")
@Serializable
public data class SpecimenCollection(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Who collected the specimen
   */
  public val collector: Reference? = null,
  /**
   * Collection time
   */
  public val collectedDateTime: String? = null,
  /**
   * Collection time
   */
  public val collectedPeriod: Period? = null,
  /**
   * How long it took to collect specimen
   */
  public val duration: Duration? = null,
  /**
   * The quantity of specimen collected
   */
  public val quantity: Quantity? = null,
  /**
   * Technique used to perform collection
   */
  public val method: CodeableConcept? = null,
  /**
   * Anatomical collection site
   */
  public val bodySite: CodeableConcept? = null,
  /**
   * Whether or how long patient abstained from food and/or drink
   */
  public val fastingStatusCodeableConcept: CodeableConcept? = null,
  /**
   * Whether or how long patient abstained from food and/or drink
   */
  public val fastingStatusDuration: Duration? = null,
) : BackboneElement
