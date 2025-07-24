//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.consent

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.coding.Coding
import com.icure.fhir.mapping.domain.fhir.r6.expression.Expression
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.period.Period
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Constraints to the base Consent.policyRule/Consent.policy
 *
 * An exception to the base policy of this consent. An exception can be an addition or removal of
 * access permissions.
 *
 * @param id Unique id for inter-element referencing
 * @param period Timeframe for this provision
 * @param dataPeriod Timeframe for data controlled by this provision
 * @param expression A computable expression of the consent
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
   * Timeframe for this provision
   */
  public val period: Period? = null,
  public val actor: List<ConsentProvisionActor> = emptyList(),
  public val action: List<CodeableConcept> = emptyList(),
  public val securityLabel: List<Coding> = emptyList(),
  public val purpose: List<Coding> = emptyList(),
  public val documentType: List<Coding> = emptyList(),
  public val resourceType: List<Coding> = emptyList(),
  public val code: List<CodeableConcept> = emptyList(),
  /**
   * Timeframe for data controlled by this provision
   */
  public val dataPeriod: Period? = null,
  public val `data`: List<ConsentProvisionData> = emptyList(),
  /**
   * A computable expression of the consent
   */
  public val expression: Expression? = null,
  public val provision: List<ConsentProvision> = emptyList(),
) : BackboneElement
