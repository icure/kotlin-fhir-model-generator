//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.contract

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r4b.period.Period
import com.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Contract Term List
 *
 * One or more Contract Provisions, which may be related and conveyed as a group, and may contain
 * nested groups.
 *
 * @param id Unique id for inter-element referencing
 * @param identifier Contract Term Number
 * @param issued Contract Term Issue Date Time
 * @param applies Contract Term Effective Time
 * @param topicCodeableConcept Term Concern
 * @param topicReference Term Concern
 * @param type Contract Term Type or Form
 * @param subType Contract Term Type specific classification
 * @param text Term Statement
 * @param offer Context of the Contract term
 */
@SerialName("ContractTerm")
@Serializable
public data class ContractTerm(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Contract Term Number
   */
  public val identifier: Identifier? = null,
  /**
   * Contract Term Issue Date Time
   */
  public val issued: String? = null,
  /**
   * Contract Term Effective Time
   */
  public val applies: Period? = null,
  /**
   * Term Concern
   */
  public val topicCodeableConcept: CodeableConcept? = null,
  /**
   * Term Concern
   */
  public val topicReference: Reference? = null,
  /**
   * Contract Term Type or Form
   */
  public val type: CodeableConcept? = null,
  /**
   * Contract Term Type specific classification
   */
  public val subType: CodeableConcept? = null,
  /**
   * Term Statement
   */
  public val text: String? = null,
  public val securityLabel: List<ContractTermSecurityLabel> = emptyList(),
  /**
   * Context of the Contract term
   */
  public val offer: ContractTermOffer,
  public val asset: List<ContractTermAsset> = emptyList(),
  public val action: List<ContractTermAction> = emptyList(),
  public val group: List<ContractTerm> = emptyList(),
) : BackboneElement
