//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.consent

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.coding.Coding
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.period.Period
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Constraints to the base Consent.policyRule
 *
 * An exception to the base policy of this consent. An exception can be an addition or removal of
 * access permissions.
 *
 * @param id Unique id for inter-element referencing
 * @param type deny | permit
 * @param period Timeframe for this rule
 * @param dataPeriod Timeframe for data controlled by this rule
 */
@SerialName("ConsentProvision")
@Serializable
public data class ConsentProvision(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * deny | permit
   */
  public val type: String? = null,
  /**
   * Timeframe for this rule
   */
  public val period: Period? = null,
  public val actor: List<ConsentProvisionActor> = emptyList(),
  public val action: List<CodeableConcept> = emptyList(),
  public val securityLabel: List<Coding> = emptyList(),
  public val purpose: List<Coding> = emptyList(),
  @SerialName("class")
  public val class_fhir: List<Coding> = emptyList(),
  public val code: List<CodeableConcept> = emptyList(),
  /**
   * Timeframe for data controlled by this rule
   */
  public val dataPeriod: Period? = null,
  public val `data`: List<ConsentProvisionData> = emptyList(),
  public val provision: List<ConsentProvision> = emptyList(),
) : BackboneElement
